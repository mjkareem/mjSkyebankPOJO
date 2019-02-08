
		public class Location {
			private String location;
			
			private String fullName;
			
			
			public void setFullName(String fName){
				this.fullName = fName;
			}
			
			public String getFullName () {
				return this.fullName;
			}
			
			
			
			
			
			
			
			
			
				public static void main (String [] args){
				
				Location L = new Location();
				L.setFullName ("Alex");
				System.out.println (L.getFullName());
				
			}
		}