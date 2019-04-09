1.	class A 
2.	    {
3.	        public int i;
4.	        private int j;
5.	    }    
6.	    class B extends A 
7.	    {
8.	        void display() 
9.	        {
10.	super.j = super.i + 1;
11.	System.out.println(super.i + " " + super.j);
12.	        }
13.	    }    
14.	    class inheritance 
15.	   {
16.	        public static void main(String args[])
17.	        {
18.	            B obj = new B();
19.	obj.i=1;
20.	obj.j=2;   
21.	obj.display();     
22.	        }
23.	   }
