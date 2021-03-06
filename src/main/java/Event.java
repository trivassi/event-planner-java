public class Event {
  public int mGuests;
  public String mFood;
  public String mBeverages;
  public String mEntertainment;


  public Event (int guests, String food, String beverages, String entertainment){
    mGuests = guests;
    mFood = food;
    mBeverages = beverages;
    mEntertainment = entertainment;
  }

  public int getGuests(){
   return mGuests;
 }

 public String getFood(){
   return mFood;
 }

 public String getBeverages(){
   return mBeverages;
 }

 public String getEntertainment(){
   return mEntertainment;
 }


  public int calcPrice(){
  Integer price = 0;

  if (mGuests < 50) {
    price += 70;
  } else if (mGuests > 50 && mGuests <= 100){
    price += 150;
  } else if ( mGuests > 100 && mGuests <= 200 ) {
    price += 250;
  } else if (mGuests > 200 && mGuests <= 300) {
    price += 300;
  } else if ( mGuests > 300 && mGuests <= 500) {
    price += 399;
  } else {
    price += (mGuests * 2);
  }

  if (mFood.equals("Mexican")) {
    price += (mGuests * 5);
  } else if (mFood.equals("Italian")) {
    price += (mGuests * 10);
  } else if (mFood.equals("French")) {
    price += (mGuests * 15);
  }

  if (mBeverages.equals("Cash Bar")) {
    price += (mGuests * 2);
  } else if (mBeverages.equals("Open Bar")) {
    price += (mGuests * 10);
  }

  if (mEntertainment.equals("DJ")) {
    price += 300;
  }else if (mEntertainment.equals("Live Band")) {
    price += 500;
  }

  return price;
  }
}
