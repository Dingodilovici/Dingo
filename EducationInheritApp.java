package first;


public class EducationInheritApp{
    public static void main(String[] args){
      // ��������� ������ ����� �����
      // �������� �������� � ������ �������
    	Educated first1 = new Educated("�������" ,17 , 9.75f , 10 );
    	first1.printInfo();
    	Pupil first2 = new Pupil("Movila","�������" ,20 , 10f , 10);
    	first2.printInfo();
    	Student first3 = new Student("IMI-Nova","Finance","Movila","�������" ,30 , 8.75f , 7);
    	first3.printInfo();
    	Master first4 = new Master("IMI-Nova","Finance","Movila","�������" ,33 , 8.75f , 3);
    	first4.printInfo();
    }
}
////////////////////////////////////////////
// ����� ������������
class Educated{
     private String fullname;     // ���
     private int   age;          // �������
     private float average_grade; // ���� ���
     private int level;          // ������� ( ����  5-�� ����� )
     
     //������� � �������
        public String getFullname() {
    		return fullname;
    	}
    	public void setFullname(String fullname) {
    		this.fullname=fullname;
    	}
    	public int getAge() {
    		return age;
    	}
    	public void setAge(int age) {
    		this.age=age;
    	}
    	public void setAge(int age,int minA,int maxA) {
    		this.age=age;
    	}
    	public float getAverage_grade() {
    		return average_grade;
    	}
    	public void setAverage_grade(float average_grade) {
    		if(average_grade>=1f && average_grade<=10f) {
       		this.average_grade=average_grade ;
       	}
    }
    	 public int getLevel() {
    		return level;
    	}
    	public void setLevel (int level) {
    		this.level=level;
    	}
    	public void setLevel(int level,int minL,int maxL) {
     		this.level=level;
     	}
 	
    // �������� ����������� � ������� ������� ��� ���� �������
    // �������� �������� �� ������ "average_grade" �������� 1..10
    // �������� ����� printInfo() ������� ������� ���� �� ���� �������� ���
        // > fullname: John Doe Jr. (17 years)
        // > class: 10
        // > grade: 9.75
      Educated() {}
      Educated(String fullname,int age,float average_grade,int level){
    	  setFullname(fullname);
    	  setAge(age);
    	  setAverage_grade(average_grade);
    	  setLevel (level);
    }
      
  
    void printInfo() {
    	System.out.println("fullname: "+fullname+"("+age+" years)\n"+"class :"+level+"\ngrade :"+average_grade);
    }
    
}

// ����� ������ - �������� ��� ��� ���������� ������ "Educated"
class Pupil extends Educated{
    // �������� ��� ����� ��� �� ������/������ - "school_name"
	private String school_name;
    public String getSchool_name() {
    	return school_name;
    }
    public void setSchool_name(String school_name) {
    	this.school_name=school_name;
    }
   
		
	
    // �������� ����������� ������� ��������� �����
	Pupil(){}
	Pupil(String school_name ,String fullname,int age,float average_grade,int level){
		
		setSchool_name(school_name);
		setFullname(fullname);
		setAge(age,6,20);
		setAverage_grade(average_grade);
		setLevel(level,1,12);
		
		
    	
  }
	 
    // � ����������� � ������/������ �������� "level"  ��������
    // �������� ����� ����� ���� ��������� ������ 1..12 �������� �������
	public void setLevel(int level,int minL,int maxL) {
			 if (level >= minL && level <= maxL) {
				super.setLevel(level);
			}
		}
    // ��� �� � ����������� � ������ ������ �������� "age" �������� �� 
    // �������� � ��������� 6..20 ���
	 public void setAge(int age,int minA,int maxA) {
		 if(age>=minA && age<=maxA) {
 		     super.setAge(age);
		 }
 	}
	 
	 
	 
    // printInfo() �������� ����� �������� �������� �������
	 void printInfo() {
	    	System.out.println("\nfullname: "+getFullname()+"("+getAge()+" years)\n"+"school : "+school_name+"\nclass :"+getLevel()+"\ngrade :"+getAverage_grade());
	    }
}

// ����� �������� - �������� ��� ��� ���������� ������ "Pupil"
class Student extends Pupil{
    // �������� ��� ������� ��� �� ������/������ - "university_name"
	private String univName;
	
	public String getUnivName() {
		return univName;
	}
	public void setUnivName(String univName) {
		this.univName=univName;
	}
    // �������� ��� ����������� �������� ��� ��  - "speciality"
	private String hisSpell;
	public String getHisSpell() {
		return hisSpell;
	}
	public void setHisSpell(String hisSpell) {
		this.hisSpell=hisSpell;
	}
    // �������� ����������� ������� ��������� ������, �����������
	Student(){}
	Student(String univName,String hisSpell,String school_name ,String fullname,int age,float average_grade,int level){
		super();
		setUnivName(univName);
		setHisSpell(hisSpell);
		setSchool_name(school_name);
		setFullname(fullname);
		setAge(age,19,30);
		setAverage_grade(average_grade);
		setLevel(level,1,7);
		
		
	}
    // � ����������� � ������/������ �������� "level"  ��������
    // �������� ����� ����� ���� ��������� ������ 1..7 �������� ������
	public void setLevel(int level,int minL,int maxL) {
		 if (level >= minL && level <= maxL) {
			super.setLevel(level);
		}
	}
    // ��� �� � ����������� � ������ ������ �������� "age" �������� �� 
    // �������� � ��������� 19..30 ���
	public void setAge(int age,int minA,int maxA) {
		 if(age>=minA && age<=maxA) {
		     super.setAge(age);
		 }
	}
	 
	 
	
	
    // printInfo() �������� ����� �������� �������� ��������
	void printInfo() {
    	System.out.println("\nfullname: "+getFullname()+"("+getAge()+" years)\n"+"school : "+getSchool_name()+"\nUniversitet : "+univName+"\nSpecialitate : "+hisSpell+"\nclass :"+getLevel()+"\ngrade :"+getAverage_grade());
    }
}

// ����� ������� - �������� ��� ��� ���������� ������ "Student"
class Master extends Student{
    // � ����������� � ������/������ �������� "level"  ��������
	Master(){}
	Master(String univName,String hisSpell,String school_name ,String fullname,int age,float average_grade,int level){
		setUnivName(univName);
		setHisSpell(hisSpell);
		setSchool_name(school_name);
		setFullname(fullname);
		setAge(age,22,33);
		setAverage_grade(average_grade);
		setLevel(level,1,3);
		getAge();
	}
    // �������� ����� ����� ���� ��������� ������ 1..3 �������� ���
	public void setLevel(int level,int minL,int maxL) {
		 if (level >= minL && level <= maxL) {
			super.setLevel(level);
		}
	}
    // ��� �� � ����������� � ������ ������ �������� "age" �������� �� 
    // �������� � ��������� 22..33 ���
	public void setAge(int age,int minA,int maxA) {
		 if(age>=minA && age<=maxA) {
		     super.setAge(age);
		 }
	}
    // printInfo() �������� ����� �������� �������� ��������
	void printInfo() {
    	System.out.println("\nfullname: "+getFullname()+"("+getAge()+" years)\n"+"school : "+getSchool_name()+"\nUniversitet : "+getUnivName()+"\nSpecialitate : "+getHisSpell()+"\nclass :"+getLevel()+"\ngrade :"+getAverage_grade());
    }
}
