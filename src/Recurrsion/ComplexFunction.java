package Recurrsion;

 class ComplexFunction {
	 int cal (int n) {
		 if(n==1) {
			 return 1;
		 }
		 else {
			 return(n*cal(n-1));
			 
		 }
	 }

}
