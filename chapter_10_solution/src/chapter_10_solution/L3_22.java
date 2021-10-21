package chapter_10_solution;
import java.util.*;

public class L3_22 {

	public static void main(String[] args) {
		
		boolean flag =true;
		String period[][]= new String[5][6];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter the Name, Atomic Number, Symbol, At Wt.. Group and valence of the element: ");
			

			for(int j = 0; j < 6; j++)
			{
				period[i][j] = input.next();
			}
		}
		
		while(flag)
		{
			System.out.println("Menu");
			System.out.println("1. Search by Name");
			System.out.println("2. Search by Symbol");
			System.out.println("3. Quit");
			System.out.println("Enter your Choice");
			
			int ch = input.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter the Name of the Element");
					input.nextLine();
					String name = input.next();
					
					for(int i = 0; i < 12; i++)
					{
						if(name.compareTo(period[ i ][ 0 ] ) == 0)
						{
							for(int j = 0 ; j < 6 ; j++)
							{
								System.out.println(period[i][j]);
							}
						}
					}
					
					flag=true;
					break;
				}

				case 2:
				{
					System.out.println( " Enter the Symbol of the Element:" );
					input.nextLine();
					String symb = input.next();
					for( int i = 0; i < 12; i++ )
						{
				
							if( symb.compareTo( period[ i ][ 2 ] ) == 0 )
							 	{
							
									for( int j = 0; j < 6; j++ )
								 		{
											System.out.println( period[ i ][ j ]);
								 		}
							 	}
						}
					 
					 flag = true;
					 break;
					 }
					 
					 case 3:
					 {
					 flag=false;
					 break;
					 }
				
			}
		}

	}

}
