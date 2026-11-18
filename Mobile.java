package basic;


    public class Mobile extends Device {

	        private long phoneNumber;

	        // Setter
	        public void setPhoneNumber(long phoneNumber) {
	            this.phoneNumber = phoneNumber;
	        }

	        // Getter
	        public long getPhoneNumber() {
	            return phoneNumber;
	        }

	        void makeCall() {
	            System.out.println("Making a phone call");
	        }
	    }
	    public class Main{
	        public static void main(String[] args) {

	            // Upcasting
	            Device d = new Mobile();

	            d.display();

	            // Downcasting
	            Mobile m = (Mobile) d;

	            // Encapsulation using setter
	            m.setPhoneNumber(9876543210L);

	            // Encapsulation using getter
	            System.out.println("Phone Number: "
	                               + m.getPhoneNumber());

	            m.makeCall();
	        }
	    }
