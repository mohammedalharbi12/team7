package lab88;

public class traingl {

		
	private static int co;
		private int a,b;
		int c;
		public traingl() {
			
		}

		public traingl(int a,int b,int c) {
			
			this.a=a;
			this.b=b;
			this.c=c;

			
		}

		public void setData(int a,int b,int c) {
			
			this.a=a;
			this.b=b;
			this.c=c;

		}
		public boolean cheak() {
			
			if(c*c==a*a + b*b) {
				return true;
			
			}
			else return false;
		}
		public static int  getcon() {
			return co;
		}
		}


