package first;


public class EducationInheritApp{
    public static void main(String[] args){
      // проверить каждый класс путем
      // создания обьектов и вызова методов
    	Educated first1 = new Educated("Евгений" ,17 , 9.75f , 10 );
    	first1.printInfo();
    	Pupil first2 = new Pupil("Movila","Евгений" ,20 , 10f , 10);
    	first2.printInfo();
    	Student first3 = new Student("IMI-Nova","Finance","Movila","Евгений" ,30 , 8.75f , 7);
    	first3.printInfo();
    	Master first4 = new Master("IMI-Nova","Finance","Movila","Евгений" ,33 , 8.75f , 3);
    	first4.printInfo();
    }
}
////////////////////////////////////////////
// класс образованный
class Educated{
     private String fullname;     // ифо
     private int   age;          // возраст
     private float average_grade; // сред бал
     private int level;          // уровень ( напр  5-ый класс )
     
     //СЕТТЕРЫ И ГЕТТЕРЫ
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
 	
    // добавить конструктор и геттеры сеттеры для всех свойств
    // добавить проверку на запись "average_grade" диапазон 1..10
    // добавить метод printInfo() который выводит инфу об этом человеке так
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

// класс ученик - добавиТь его как наследника класса "Educated"
class Pupil extends Educated{
    // добавить имя школы где он учится/учился - "school_name"
	private String school_name;
    public String getSchool_name() {
    	return school_name;
    }
    public void setSchool_name(String school_name) {
    	this.school_name=school_name;
    }
   
		
	
    // добавить конструктор который учитывает школу
	Pupil(){}
	Pupil(String school_name ,String fullname,int age,float average_grade,int level){
		
		setSchool_name(school_name);
		setFullname(fullname);
		setAge(age,6,20);
		setAverage_grade(average_grade);
		setLevel(level,1,12);
		
		
    	
  }
	 
    // в контсруктор и геттер/сеттер свойства "level"  добавить
    // проверку чтобы можно было прописать только 1..12 диапазон классов
	public void setLevel(int level,int minL,int maxL) {
			 if (level >= minL && level <= maxL) {
				super.setLevel(level);
			}
		}
    // так же в конструктор и геттер сеттер свойства "age" проверку на 
    // значение в диапазоне 6..20 лет
	 public void setAge(int age,int minA,int maxA) {
		 if(age>=minA && age<=maxA) {
 		     super.setAge(age);
		 }
 	}
	 
	 
	 
    // printInfo() Допилить чтобы учитывал свойства ученика
	 void printInfo() {
	    	System.out.println("\nfullname: "+getFullname()+"("+getAge()+" years)\n"+"school : "+school_name+"\nclass :"+getLevel()+"\ngrade :"+getAverage_grade());
	    }
}

// класс студента - добавиТь его как наследника класса "Pupil"
class Student extends Pupil{
    // добавить имя универа где он учится/учился - "university_name"
	private String univName;
	
	public String getUnivName() {
		return univName;
	}
	public void setUnivName(String univName) {
		this.univName=univName;
	}
    // добавить имя направления обучения где он  - "speciality"
	private String hisSpell;
	public String getHisSpell() {
		return hisSpell;
	}
	public void setHisSpell(String hisSpell) {
		this.hisSpell=hisSpell;
	}
    // добавить конструктор который учитывает универ, направление
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
    // в контсруктор и геттер/сеттер свойства "level"  добавить
    // проверку чтобы можно было прописать только 1..7 диапазон курсов
	public void setLevel(int level,int minL,int maxL) {
		 if (level >= minL && level <= maxL) {
			super.setLevel(level);
		}
	}
    // так же в конструктор и геттер сеттер свойства "age" проверку на 
    // значение в диапазоне 19..30 лет
	public void setAge(int age,int minA,int maxA) {
		 if(age>=minA && age<=maxA) {
		     super.setAge(age);
		 }
	}
	 
	 
	
	
    // printInfo() Допилить чтобы учитывал свойства студента
	void printInfo() {
    	System.out.println("\nfullname: "+getFullname()+"("+getAge()+" years)\n"+"school : "+getSchool_name()+"\nUniversitet : "+univName+"\nSpecialitate : "+hisSpell+"\nclass :"+getLevel()+"\ngrade :"+getAverage_grade());
    }
}

// класс мастера - добавиТь его как наследника класса "Student"
class Master extends Student{
    // в контсруктор и геттер/сеттер свойства "level"  добавить
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
    // проверку чтобы можно было прописать только 1..3 диапазон лет
	public void setLevel(int level,int minL,int maxL) {
		 if (level >= minL && level <= maxL) {
			super.setLevel(level);
		}
	}
    // так же в конструктор и геттер сеттер свойства "age" проверку на 
    // значение в диапазоне 22..33 лет
	public void setAge(int age,int minA,int maxA) {
		 if(age>=minA && age<=maxA) {
		     super.setAge(age);
		 }
	}
    // printInfo() Допилить чтобы учитывал свойства студента
	void printInfo() {
    	System.out.println("\nfullname: "+getFullname()+"("+getAge()+" years)\n"+"school : "+getSchool_name()+"\nUniversitet : "+getUnivName()+"\nSpecialitate : "+getHisSpell()+"\nclass :"+getLevel()+"\ngrade :"+getAverage_grade());
    }
}
