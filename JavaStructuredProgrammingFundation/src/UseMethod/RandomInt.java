package UseMethod;

import javax.swing.JOptionPane;

public class RandomInt {
   public static void main(String[] args)
   {
      int value;
      String output = "";

      for ( int i = 1; i <= 20; i++ ) {
         value = 1 + (int) ( Math.random() * 6 );
         output += value + "  ";
         if ( i % 5 == 0 )
            output += "\n";
      }

      JOptionPane.showMessageDialog( null,
              output,
         "生成20个从1到6的随机数",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }
}