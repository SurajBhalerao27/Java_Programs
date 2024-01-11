/*In network Marketing a person who sells some merchandise becomes the root Node of a so-called network marketing tree. 
When the first person inducts someone into the network marketing tree the first person becomes the supervisor. 
Likewise, if this new recruit inducts a third person into the network marketing tree the new recruit becomes supervisor 
of the third person. The tree grows so on and so forth.
Whenever anybody in the network marketing tree makes a profit, they have to pass a certain percentage of that profit to their 
supervisor. The percentage of the profit passed to the supervisor will be rounded to the nearest integer, 
and hence will always be an integer at each level. Calculate the profit of the person at the root of the network marketing tree 
coming from a particular individual at Nth level in the tree.

Constraints
1<N<20
0<M<10^8
0<P<=50

Input
>The input has three lines, each with one integer.
>The first line contains an integer N, which determines the height of the network marketing tree
>The second line contains an integer M, which denotes the profit earned by a particular individual at Nth level.
>The third line contains an integer P, which denotes profit % that needs to be passed on to supervisor.
*/
package competitive;

import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int p = sc.nextInt();
    sc.close();
    while (n > 1) {
      m = m * p / 100;
      n--;
    }
    System.out.print(m);
  }
}
