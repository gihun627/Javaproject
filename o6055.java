package gh4;

class UserException1 extends Exception {  
    public UserException1(String message) {
    		super(message);
    		System.out.printf("����� ���� 1\n");
    }
}

class UserException2 extends Exception {
    public UserException2(String message) {
    		super(message);
    		System.out.printf("����� ���� 2\n");
    }
}

public class o6055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[2]); 
		char c = args[1].charAt(0);
		
		if(args.length != 3)
		{
	           throw new UserException1("����� ���� ���� 1");
		}
		if(c == '+'){
			 System.out.printf("%d + %d = %d \n", a,b,a+b);
		}
		else if(c == '-')
		{
			 System.out.printf("%d - %d = %d \n", a,b,a-b);
		}
		else
		{
			 throw new UserException2("����� ���� ���� 2");
		}	
		}
	    catch(UserException1 e) {
	        System.out.println("UserException1 ó�� ��ƾ : ");
	        System.out.println(e + " �߻�");
	      }
	    catch(UserException2 e) {
	        System.out.println("UserException2 ó�� ��ƾ : ");
	        System.out.println(e + " �߻�");
	      }
	      catch(Exception e) {
	       System.out.println("��� ���� ó�� ��ƾ : ");
	       System.out.println(e + " �߻�");
	      }
	  }
}


