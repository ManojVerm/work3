import java.util.Objects;

public class Transaction {
	private int transactionId;
	private double amount;
	private String transdate;

	public Transaction(int transactionId, double amount, String transdate) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.transdate = transdate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getTransdate() {
		return transdate;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Transaction that = (Transaction) o;
		return transactionId == that.transactionId && Double.compare(that.amount, amount) == 0
				&& Objects.equals(transdate, that.transdate);
	}

	public static void main(String[] args) {
		Transaction transaction1 = new Transaction(5, 500.0, "2022-07-03");
		Transaction transaction2 = new Transaction(2, 400.0, "2023-08-06");

		System.out.println(transaction1.equals(transaction2));
	}
}
