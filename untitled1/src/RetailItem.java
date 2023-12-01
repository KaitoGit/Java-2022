


public class RetailItem {

        private static String description;   //description of the item.

        private static int unitsOnHand;     //number of units currently in inventory.

        private static double price;       //holds the item’s retail price


        /**
         @param itemDesc The brand of the tv.
         */

        public RetailItem(String itemDesc,int units, double retailPrice){

                description = itemDesc;
                unitsOnHand = units;
                price = retailPrice;

        }

        public String getDescription(){
                return description;
        }

        public int getUnitsOnHand(){
                return unitsOnHand;
        }

        public double getPrice(){
                return price;
        }

        public void setDescription(String itemDesc){

                this.description = itemDesc;

        }
        public void setPrice(double price) throws negativePrice{
                if(price < 0 ){
                        throw new negativePrice(price);
                }
                this.price =price;

        }
        public void setUnitsOnHand(int unites) throws negativeUnits{


                if(unitsOnHand< 0 ){
                        throw new negativeUnits(unitsOnHand);
                }
                this.unitsOnHand = unites;
        }


}
