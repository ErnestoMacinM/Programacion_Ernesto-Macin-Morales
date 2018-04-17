public class Bear{

  private final String MAKER = "";//bear's manufacturer
  private final String TYPE;//type of bear

  public Bear(String maker, String type){
      this.MAKER =  maker;
      this.TYPE = type;
   }
   public void display(){
     JOptionPane.showMessageDialog(null, MAKER + " " + TYPE);
   }
   public static void main(String[] args){
     ArrayList <Bear> teddyBearStore = new ArrayList <Bear>();
     int opc;

     do {
         opc = Integer.parseInt(JOptionPane.showMessageDialog(null,".....MENU......\n 1.- Add Bear\n 2.-Search..\n3.-Remove--\n4.-Show all\n 5.-Exit"));

       switch(opc){
      case 1:
         String maker = JOptionPane.showInputDialog("Maker??");
         String type = JOptionPane.showInputDialog("Type??");
         Bear winniePoo = new Bear(maker, type);
         teddyBearStore.add(winniePoo);
         break;
      case 2:
         int index = Integer.parseInt(JOptionPane.showInputDialog("index??"));
         teddyBearStore.get(index).display();
         break;
      case 3:
         index = Integer.parseInt(JOptionPane.showInputDialog("index to remove??"));
         if (teddyBearStore.remove(index) != null) {
           JOptionPane.showMessageDialog(null, "Element removed");
         }else{
           JOptionPane.showMessageDialog(null,"Element wasn't removed ");
         }
         break;
      case 4:
         for (Bear bear : teddyBearStore ) {
           bear.display();
         }
         break;

       }

     } while (opc!= 5);

   }
  }
