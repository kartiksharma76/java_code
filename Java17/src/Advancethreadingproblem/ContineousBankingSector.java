package Advancethreadingproblem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
	private int balance = 1000;
	private final ReentrantLock lock = new ReentrantLock();

	private String gettime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public void deposit(int amount, String user) {
		lock.lock();
		try {
			balance += amount;
			System.out.println(gettime() + " | " + user + " deposited: " + amount + " | New Balance: " + balance);
			synchronized (this) {
				notify();
			}
		} finally {
			lock.unlock();
		}
	}

	public void withdraw(int amount, String user) {
		synchronized (this) {
			while (balance < amount) {
				try {
					System.out.println(gettime() + " | " + user + " waiting to withdraw: " + amount + " | Balance: " + balance);
					wait();
				} catch (InterruptedException e) {
					System.out.println("Interrupted while waiting");
				}
			}
		}

		lock.lock();
		try {
			balance -= amount;
			System.out.println(gettime() + " | " + user + " withdrew: " + amount + " | New Balance: " + balance);
		} finally {
			lock.unlock();
		}
	}

	public int getBalance() {
		return balance;
	}
}


class DepositTask implements Runnable {
	private final BankAccount account;
	private final String user;
	private final Random random = new Random();

	public DepositTask(BankAccount account, String user) {
		this.account = account;
		this.user = user;
	}

	@Override
	public void run() {
		while (true) {
			int amount = 100 + random.nextInt(400);
			account.deposit(amount, user);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class WithdrawTask implements Runnable {
	private final BankAccount account;
	private final String user;
	private final Random random = new Random();

	public WithdrawTask(BankAccount account, String user) {
		this.account = account;
		this.user = user;
	}

	@Override
	public void run() {
		while (true) {
			int amount = 100 + random.nextInt(400);
			account.withdraw(amount, user);
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ContineousBankingSector {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		ExecutorService service = Executors.newFixedThreadPool(4);

		// 2 users depositing
		service.execute(new DepositTask(account, "Depositor-Kartik"));
		service.execute(new DepositTask(account, "Depositor-Twinkle"));

		// 2 users withdrawing
		service.execute(new WithdrawTask(account, "Withdrawer-Prince"));
		service.execute(new WithdrawTask(account, "Withdrawer-Keertan"));

	}
}
