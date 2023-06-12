public class Current {
	String companyName;
	String typeOfBusiness;
	String website;
	String contactName;

	public Current(String companyName, String typeOfBusiness, String website, String contactName) {
		this.companyName = companyName;
		this.typeOfBusiness = typeOfBusiness;
		this.website = website;
		this.contactName = contactName;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Current other = (Current) obj;

		return companyName.equals(other.companyName) && typeOfBusiness.equals(other.typeOfBusiness)
				&& website.equals(other.website) && contactName.equals(other.contactName);
	}

	public static void main(String[] args) {

		Current company1 = new Current("codegnan", "it solutions", "www.codegnan.com", "abc def");
		Current company2 = new Current("codegnan", "it solutions", "www.codegnan.com", "abc def");

		boolean isEqual = company1.equals(company2);

		System.out.println(isEqual);
	}
}
