package Stack;

import java.util.Stack;

public class BankAccount {
	private int Balance;

	private Stack<Integer> transactionStack;
	private Stack<Integer> CommitStack;

	public BankAccount(int initialBalance) {
		Balance = initialBalance;
		transactionStack = new Stack<>();
		CommitStack = new Stack<>();
		CommitStack.push(Balance);

	}

	public void read() {  
		System.out.println(Balance);

	}

	public void Cradit(int amount) {
		Balance += amount;
		transactionStack.push(amount);
	}

	public void Debit(int amount) {
		if (Balance >= amount) {
			Balance -= amount;
			transactionStack.push(-amount);

		}
	}

	public void Abort(int transactionIndex) {
		if (transactionIndex <= transactionStack.size()) {
			for (int i = 0; i < transactionIndex; i++) {
				int amount = transactionStack.pop();
				Balance -= amount;
			}
		}
	}

	public void RollBack(int CommitIndex) {
		if (CommitIndex <= CommitStack.size()) {
			while (CommitStack.size() > CommitIndex) {
				CommitStack.pop();

			}
			Balance = CommitStack.peek();
			transactionStack.clear();

		}
	}

	public void Commit() {
		CommitStack.push(Balance);
		transactionStack.clear();
	}
}
