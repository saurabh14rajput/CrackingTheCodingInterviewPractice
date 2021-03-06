import java.util.*;

class ZeroMatrix {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int numCases=sc.nextInt();
		
		for(int k=0;k<numCases;k++){
		    int r=sc.nextInt();
		    int c=sc.nextInt();
		    boolean[] row=new boolean[r];
		    boolean[] col=new boolean[c];
		    int[][] matrix=new int[r][c];
		    //take the input
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            matrix[i][j]=sc.nextInt();
		        }
		    }
		    //in one pass check the matrix for 1's 
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            if(matrix[i][j]==1){
		                row[i]=true;
		                col[j]=true;
		            }
		        }
		    }
		    //fill the marked rows with 1's	
		    for(int i=0;i<r;i++){
		        if(row[i]){
		            for(int j=0;j<c;j++){
		                matrix[i][j]=1;
		            }
		        }
		    }
		    //fill the marked columns with 1's
		    for(int j=0;j<c;j++){
		        if(col[j]){
		            for(int i=0;i<r;i++){
		                matrix[i][j]=1;
		            }
		        }
		    }
		    //print the output
		    System.out.println("Done");
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            System.out.println(matrix[i][j]);
		        }
		    }
		}
		sc.close();
	}
}