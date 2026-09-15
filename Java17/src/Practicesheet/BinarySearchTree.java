package Practicesheet;

import java.util.Scanner;

public class BinarySearchTree {
	private Node root;
	private Scanner scanner;

	public BinarySearchTree() {
		this.scanner = new Scanner(System.in);
	}

	// Insert operation
	public void insert(int key) {
		root = insertHelper(root, key);
	}

	private Node insertHelper(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}
		if (key < root.key) {
			root.left = insertHelper(root.left, key);
		} else if (key > root.key) {
			root.right = insertHelper(root.right, key);
		}
		return root;
	}

	// Search operation
	public boolean search(int key) {
		return searchHelper(root, key) != null;
	}

	private Node searchHelper(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}
		if (key < root.key) {
			return searchHelper(root.left, key);
		}
		return searchHelper(root.right, key);
	}

	// Delete operation
	public void delete(int key) {
		root = deleteHelper(root, key);
	}

	private Node deleteHelper(Node root, int key) {
		if (root == null) {
			return null;
		}

		if (key < root.key) {
			root.left = deleteHelper(root.left, key);
		} else if (key > root.key) {
			root.right = deleteHelper(root.right, key);
		} else {
			// Node to delete found

			// Case 1: Node with no children
			if (root.left == null && root.right == null) {
				return null;
			}

			// Case 2: Node with one child
			if (root.left == null) {
				return root.right;
			}
			if (root.right == null) {
				return root.left;
			}

			// Case 3: Node with two children
			// Find inorder successor (smallest in right subtree)
			Node successor = findMin(root.right);
			root.key = successor.key;
			root.right = deleteHelper(root.right, successor.key);
		}
		return root;
	}

	private Node findMin(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	// Traversal Methods

	public void inorder() {
		System.out.print("Inorder Traversal (Sorted Order): ");
		inorderHelper(root);
		System.out.println();
	}

	private void inorderHelper(Node root) {
		if (root == null)
			return;
		inorderHelper(root.left);
		System.out.print(root.key + " ");
		inorderHelper(root.right);
	}

	public void preorder() {
		System.out.print("Preorder Traversal: ");
		preorderHelper(root);
		System.out.println();
	}

	private void preorderHelper(Node root) {
		if (root == null)
			return;
		System.out.print(root.key + " ");
		preorderHelper(root.left);
		preorderHelper(root.right);
	}

	public void postorder() {
		System.out.print("Postorder Traversal: ");
		postorderHelper(root);
		System.out.println();
	}

	private void postorderHelper(Node root) {
		if (root == null)
			return;
		postorderHelper(root.left);
		postorderHelper(root.right);
		System.out.print(root.key + " ");
	}

	public void levelOrder() {
		System.out.print("Level Order Traversal: ");
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}

		java.util.Queue<Node> queue = new java.util.LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.key + " ");

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		System.out.println();
	}

	// Utility Methods

	public int findMin() {
		if (root == null)
			return -1;
		return findMin(root).key;
	}

	public int findMax() {
		if (root == null)
			return -1;
		return findMax(root).key;
	}

	private Node findMax(Node root) {
		while (root.right != null) {
			root = root.right;
		}
		return root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int getHeight() {
		return calculateHeight(root);
	}

	private int calculateHeight(Node root) {
		if (root == null)
			return 0;
		return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
	}

	public int countNodes() {
		return countNodesHelper(root);
	}

	private int countNodesHelper(Node root) {
		if (root == null)
			return 0;
		return 1 + countNodesHelper(root.left) + countNodesHelper(root.right);
	}

	// Real-world application methods using Scanner

	public void employeeManagementSystem() {
		System.out.println("\n=== EMPLOYEE ID MANAGEMENT SYSTEM ===");
		BinarySearchTree empTree = new BinarySearchTree();

		while (true) {
			System.out.println("\n1. Add Employee ID");
			System.out.println("2. Remove Employee ID");
			System.out.println("3. Search Employee ID");
			System.out.println("4. Display All IDs (Sorted)");
			System.out.println("5. Display Tree Statistics");
			System.out.println("6. Return to Main Menu");
			System.out.print("Choose option (1-6): ");

			int choice = getValidIntInput(1, 6);

			switch (choice) {
			case 1:
				System.out.print("Enter Employee ID to add (4-digit number): ");
				int empId = getValidIntInput(1000, 9999);
				empTree.insert(empId);
				System.out.println("Employee ID " + empId + " added successfully!");
				break;

			case 2:
				System.out.print("Enter Employee ID to remove: ");
				int removeId = getValidIntInput(1000, 9999);
				if (empTree.search(removeId)) {
					empTree.delete(removeId);
					System.out.println("Employee ID " + removeId + " removed successfully!");
				} else {
					System.out.println("Employee ID not found!");
				}
				break;

			case 3:
				System.out.print("Enter Employee ID to search: ");
				int searchId = getValidIntInput(1000, 9999);
				boolean found = empTree.search(searchId);
				System.out.println("Employee ID " + searchId + " is " + (found ? "FOUND" : "NOT FOUND"));
				break;

			case 4:
				System.out.println("\nAll Employee IDs (Sorted):");
				empTree.inorder();
				System.out.println("Total Employees: " + empTree.countNodes());
				break;

			case 5:
				System.out.println("\n=== Tree Statistics ===");
				System.out.println("Total Employees: " + empTree.countNodes());
				System.out.println("Tree Height: " + empTree.getHeight());
				System.out.println("Smallest ID: " + (empTree.isEmpty() ? "N/A" : empTree.findMin()));
				System.out.println("Largest ID: " + (empTree.isEmpty() ? "N/A" : empTree.findMax()));
				System.out.println("Is Tree Empty: " + (empTree.isEmpty() ? "Yes" : "No"));
				break;

			case 6:
				return;
			}
		}
	}

	public void productInventorySystem() {
		System.out.println("\n=== PRODUCT INVENTORY SYSTEM ===");
		BinarySearchTree productTree = new BinarySearchTree();

		while (true) {
			System.out.println("\n1. Add Product Price");
			System.out.println("2. Remove Product Price");
			System.out.println("3. Search for Price");
			System.out.println("4. View All Prices (Different Orders)");
			System.out.println("5. Price Range Analysis");
			System.out.println("6. Return to Main Menu");
			System.out.print("Choose option (1-6): ");

			int choice = getValidIntInput(1, 6);

			switch (choice) {
			case 1:
				System.out.print("Enter product price to add (1-1000): $");
				int price = getValidIntInput(1, 1000);
				productTree.insert(price);
				System.out.println("Price $" + price + " added to inventory!");
				break;

			case 2:
				System.out.print("Enter price to remove: $");
				int removePrice = getValidIntInput(1, 1000);
				if (productTree.search(removePrice)) {
					productTree.delete(removePrice);
					System.out.println("Price $" + removePrice + " removed from inventory!");
				} else {
					System.out.println("Price not found in inventory!");
				}
				break;

			case 3:
				System.out.print("Enter price to search: $");
				int searchPrice = getValidIntInput(1, 1000);
				boolean found = productTree.search(searchPrice);
				System.out.println("Price $" + searchPrice + " is " + (found ? "AVAILABLE" : "NOT AVAILABLE"));
				break;

			case 4:
				System.out.println("\n=== All Product Prices ===");
				productTree.inorder();
				productTree.preorder();
				productTree.postorder();
				productTree.levelOrder();
				break;

			case 5:
				if (productTree.isEmpty()) {
					System.out.println("Inventory is empty!");
				} else {
					System.out.println("\n=== Price Range Analysis ===");
					System.out.println("Cheapest Product: $" + productTree.findMin());
					System.out.println("Most Expensive: $" + productTree.findMax());
					System.out.println("Average Price: $" + (productTree.countNodes() > 0
							? "Calculated from " + productTree.countNodes() + " products"
							: "N/A"));
				}
				break;

			case 6:
				return;
			}
		}
	}

	public void studentGradeSystem() {
		System.out.println("\n=== STUDENT GRADE MANAGEMENT SYSTEM ===");
		BinarySearchTree gradeTree = new BinarySearchTree();

		while (true) {
			System.out.println("\n1. Add Student Grade (0-100)");
			System.out.println("2. Remove Grade");
			System.out.println("3. Search for Grade");
			System.out.println("4. View Grade Distribution");
			System.out.println("5. Performance Analysis");
			System.out.println("6. Return to Main Menu");
			System.out.print("Choose option (1-6): ");

			int choice = getValidIntInput(1, 6);

			switch (choice) {
			case 1:
				System.out.print("Enter student grade (0-100): ");
				int grade = getValidIntInput(0, 100);
				gradeTree.insert(grade);
				System.out.println("Grade " + grade + " added!");
				break;

			case 2:
				System.out.print("Enter grade to remove: ");
				int removeGrade = getValidIntInput(0, 100);
				if (gradeTree.search(removeGrade)) {
					gradeTree.delete(removeGrade);
					System.out.println("Grade " + removeGrade + " removed!");
				} else {
					System.out.println("Grade not found!");
				}
				break;

			case 3:
				System.out.print("Enter grade to search: ");
				int searchGrade = getValidIntInput(0, 100);
				boolean found = gradeTree.search(searchGrade);
				System.out.println("Grade " + searchGrade + " is " + (found ? "PRESENT" : "ABSENT"));
				break;

			case 4:
				System.out.println("\n=== Grade Distribution (Sorted) ===");
				gradeTree.inorder();
				System.out.println("Total Students: " + gradeTree.countNodes());
				break;

			case 5:
				if (gradeTree.isEmpty()) {
					System.out.println("No grades entered!");
				} else {
					System.out.println("\n=== Performance Analysis ===");
					System.out.println("Lowest Grade: " + gradeTree.findMin());
					System.out.println("Highest Grade: " + gradeTree.findMax());
					System.out.println("Total Students: " + gradeTree.countNodes());

					// Count grades in different ranges
					System.out.println("\nGrade Categories:");
					System.out.println("Failing (<40): [Count would be implemented with traversal]");
					System.out.println("Passing (40-59): [Count would be implemented with traversal]");
					System.out.println("Good (60-79): [Count would be implemented with traversal]");
					System.out.println("Excellent (80-100): [Count would be implemented with traversal]");
				}
				break;

			case 6:
				return;
			}
		}
	}

	public void interactiveTreeOperations() {
		System.out.println("\n=== INTERACTIVE TREE OPERATIONS ===");

		while (true) {
			System.out.println("\n1. Insert Element");
			System.out.println("2. Delete Element");
			System.out.println("3. Search Element");
			System.out.println("4. Tree Traversals");
			System.out.println("5. Tree Information");
			System.out.println("6. Clear Tree");
			System.out.println("7. Return to Main Menu");
			System.out.print("Choose option (1-7): ");

			int choice = getValidIntInput(1, 7);

			switch (choice) {
			case 1:
				System.out.print("Enter number to insert: ");
				int insertVal = scanner.nextInt();
				scanner.nextLine(); // Clear buffer
				this.insert(insertVal);
				System.out.println("Value " + insertVal + " inserted!");
				break;

			case 2:
				System.out.print("Enter number to delete: ");
				int deleteVal = scanner.nextInt();
				scanner.nextLine(); // Clear buffer
				if (this.search(deleteVal)) {
					this.delete(deleteVal);
					System.out.println("Value " + deleteVal + " deleted!");
				} else {
					System.out.println("Value not found in tree!");
				}
				break;

			case 3:
				System.out.print("Enter number to search: ");
				int searchVal = scanner.nextInt();
				scanner.nextLine(); // Clear buffer
				boolean found = this.search(searchVal);
				System.out.println("Value " + searchVal + " is " + (found ? "FOUND" : "NOT FOUND"));
				break;

			case 4:
				System.out.println("\n=== Tree Traversals ===");
				this.inorder();
				this.preorder();
				this.postorder();
				this.levelOrder();
				break;

			case 5:
				System.out.println("\n=== Tree Information ===");
				System.out.println("Tree Height: " + this.getHeight());
				System.out.println("Total Nodes: " + this.countNodes());
				System.out.println("Minimum Value: " + (this.isEmpty() ? "N/A" : this.findMin()));
				System.out.println("Maximum Value: " + (this.isEmpty() ? "N/A" : this.findMax()));
				System.out.println("Is Tree Empty: " + (this.isEmpty() ? "Yes" : "No"));
				break;

			case 6:
				this.root = null;
				System.out.println("Tree cleared successfully!");
				break;

			case 7:
				return;
			}
		}
	}

	// Helper method for validated integer input
	private int getValidIntInput(int min, int max) {
		while (true) {
			try {
				System.out.print("Enter your choice: ");
				int input = scanner.nextInt();
				scanner.nextLine(); // Clear buffer

				if (input >= min && input <= max) {
					return input;
				} else {
					System.out.println("Please enter a number between " + min + " and " + max);
				}
			} catch (Exception e) {
				System.out.println("Invalid input! Please enter a valid number.");
				scanner.nextLine(); // Clear invalid input
			}
		}
	}

	public void showMenu() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║   BINARY SEARCH TREE - REAL WORLD APPS   ║");
		System.out.println("╚══════════════════════════════════════════╝");

		while (true) {
			System.out.println("\n=== MAIN MENU ===");
			System.out.println("1. Employee Management System");
			System.out.println("2. Product Inventory System");
			System.out.println("3. Student Grade System");
			System.out.println("4. Interactive Tree Operations");
			System.out.println("5. Tree Traversal Examples");
			System.out.println("6. Exit");
			System.out.print("Choose an application (1-6): ");

			int choice = getValidIntInput(1, 6);

			switch (choice) {
			case 1:
				employeeManagementSystem();
				break;
			case 2:
				productInventorySystem();
				break;
			case 3:
				studentGradeSystem();
				break;
			case 4:
				interactiveTreeOperations();
				break;
			case 5:
				demonstrateTraversals();
				break;
			case 6:
				System.out.println("\nThank you for using BST Applications!");
				System.out.println("Exiting program...");
				scanner.close();
				return;
			}
		}
	}

	private void demonstrateTraversals() {
		System.out.println("\n=== TREE TRAVERSAL DEMONSTRATION ===");

		BinarySearchTree demoTree = new BinarySearchTree();
		System.out.println("Creating a sample tree with values: 50, 30, 70, 20, 40, 60, 80");

		demoTree.insert(50);
		demoTree.insert(30);
		demoTree.insert(70);
		demoTree.insert(20);
		demoTree.insert(40);
		demoTree.insert(60);
		demoTree.insert(80);

		System.out.println("\nTree Structure:");
		System.out.println("       50");
		System.out.println("      /  \\");
		System.out.println("    30    70");
		System.out.println("   /  \\  /  \\");
		System.out.println("  20  40 60  80");

		System.out.println("\n1. Inorder Traversal (Left, Root, Right):");
		System.out.println("   Result: Sorted order of elements");
		demoTree.inorder();

		System.out.println("\n2. Preorder Traversal (Root, Left, Right):");
		System.out.println("   Result: Useful for copying tree structure");
		demoTree.preorder();

		System.out.println("\n3. Postorder Traversal (Left, Right, Root):");
		System.out.println("   Result: Useful for deleting tree");
		demoTree.postorder();

		System.out.println("\n4. Level Order Traversal (Breadth-First):");
		System.out.println("   Result: Processes nodes level by level");
		demoTree.levelOrder();

		System.out.println("\nPress Enter to continue...");
		scanner.nextLine();
	}

	// Node class
	class Node {
		private int key;
		private Node left;
		private Node right;

		public Node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}

	// Main method
	public static void main(String[] args) {
		BinarySearchTree bstApp = new BinarySearchTree();
		bstApp.showMenu();
	}
}