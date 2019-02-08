/*
	Account creation for various users
	copyright 2019
	Mujahid Abdulkareem
	mujahidakande@gmail.com
	February 2019
*/

	// package skyebank.account
	public class Card {
		private String cardName;
		private int cardNumber;
		private String expiryDate;
		private int cvcNumber;
		private crdType cardType = crdType.MASTERCARD; // to specify if it is mastercard, visaCard or verveCard 
		
		
		// setters and getters method for each of the instanceVariable as methods
		
		//settersAndGetters for cardName
		public void setCardName (String cName){
			this.cardName = cName;
		}
		public String getCardName (){
			return this.cardName;
		}
		
		//settersAndGetters for cardNumber
		public void setCardNumber (int cNumber){
			this.cardNumber = cNumber;
		}
		public int getCardNumber (){
			return this.cardNumber;
		}
		
		//settersAndGetters for cardType
		public void setCardType (crdType cType){
			this.cardType = cType;
		}
		public int getCardType (){
			return this.cardType;
		}
		
		
		
		public static void main (String args[]){
			Card cardManager = new Card();
			cardManager.setCardName ("Olabisi Omolayo Janet");
			System.out.println (cardManager.getCardName());
			
		
			cardManager.setcardType (crdType.MASTERCARD);
			System.out.println (cardManager.getcardType());
			
		}
				
		
		
	}