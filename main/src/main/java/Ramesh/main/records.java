package Ramesh.main;

public class records {
		private int id;
		private String first_name;
		private String last_name;
		private int phone;
		private String email;
		private boolean role;
		
		public records() {}
		
		
		public records(int id,String first_name, String last_name, int phone, String email, boolean role) {
			super();
			this.id=id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.phone = phone;
			this.email = email;
			this.role = role;
		}

		public int getId()
		{
			return id;
		}
		public void setId(int id)
		{
			this.id=id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean isRole() {
			return role;
		}
		public void setRole(boolean role) {
			this.role = role;
		}


		@Override
		public String toString() {
			return "data:{\n id="+ id + ",\n"
					+ " first_name= " + first_name + ",\n"
					+ "last_name=" + last_name + ",\n"
				    + "phone=" + phone + ",\n"
					+ "email="+ email + ",\n"
					+ " role=" + role + "}";
		}
}