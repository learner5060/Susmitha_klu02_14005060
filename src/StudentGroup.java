
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
        
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
        
	@Override
	public Student[] getStudents() {
		
		return students;
	}
       
	@Override
	public void setStudents(Student[] students) {
	try{	
            if(students == null){
                throw new IllegalArgumentException();
            }
            
            else{
                for(int j=0;j<students.length;j++){
                    this.students[j]=students[j];
                }
            }
             
        }
        catch(IllegalArgumentException e){
            System.out.println("Empty student array");
        }
        
        
        
	}
      
	@Override
	public Student getStudent(int index) {
            Student[] st = new Student[getStudents().length] ;
            st = getStudents();
            try{
		if(index<0 && index>s.length){
                     throw new IllegalArgumentException();
                }
                else{
                    return st[index];
                }
            }
            catch(IllegalArgumentException e){
                System.out.println(e);
                return null;
            }
		
	}

	@Override
	public void setStudent(Student student, int index) {
            Student[] st = new Student[getStudents().length] ;
            st = getStudents();
            try{
            if(index<0 && index>st.length && student == null){
                     throw new IllegalArgumentException();
                }
                else{
                    st[index] = student;
              }
            
            setStudents(st);
            }
             catch(IllegalArgumentException e){
                System.out.println(e);
                
            }
		
	}

	@Override
	public void addFirst(Student student) {
            try{
             if(students == null){
                throw new IllegalArgumentException();
            }
             else{
            Student[] st = new Student[getStudents().length] ;
            st = getStudents();
            ArrayList<Student> students = new ArrayList<Student>();
            students.add(student);
            for(int i=0;i<st.length;i++){
                students.add(st[i]);
            }
            Student[] st1 = (Student[]) students.toArray();
            setStudents(st1);
            
             }
            }
             catch(IllegalArgumentException e){
                System.out.println(e);
               
            }
	}

	@Override
	public void addLast(Student student) {
            try{
             if(students == null){
                throw new IllegalArgumentException();
            }
             else{
            Student[] st = new Student[getStudents().length] ;
            st = getStudents();
            ArrayList<Student> students = new ArrayList<Student>();
            
            for(int i=0;i<st.length;i++){
                students.add(st[i]);
            }
            students.add(student);
            Student[] st1 = (Student[]) students.toArray();
            setStudents(st1);
             }
            }
             catch(IllegalArgumentException e){
                System.out.println(e);
               
            }
	}

	@Override
	public void add(Student student, int index) {
            try{
              Student[] st = new Student[getStudents().length] ;
             if(index<0 && index>st.length && student == null){
                     throw new IllegalArgumentException();
                }
             
             else{
            ArrayList<Student> students = new ArrayList<Student>();
            
            for(int i=0;i<st.length;i++){
                students.add(st[i]);
            }
            students.add(index,student);
            Student[] st1 = (Student[]) students.toArray();
            setStudents(st1);
            
             }
            }
             catch(IllegalArgumentException e){
                System.out.println(e);
                
            }
	}

	@Override
	
        public void remove(int index) {
// Add your implementation here
// Add your implementation here
try{
if(index<0 && index>=students.length){
throw new IllegalArgumentException();
}
else{
for(int i=0;i<index;i++){
if(students[i]==students[index]){
students[i]=students[i+1];
}
}
}
} 
catch(IllegalArgumentException e){
System.out.println(e);
}
} 


	@Override
	public void remove(Student student) {
		// Add your implementation here
                try{
if(student==null){
throw new IllegalArgumentException();
}



for(int i=0;i<students.length;i++){
if(students[i]==student){
students[i]=students[i+1];
}
}
} 
catch(IllegalArgumentException e){
System.out.println(e);
}

	}

	@Override
	public void removeFromIndex(int index) {
		try{ 
if(index<0 || students.length>=index){
throw new IllegalArgumentException(); 
}
else{
int i;

for(i=index+1;i<students.length;i++){
students[i]=null;
}
}
}
catch(IllegalArgumentException e){
System.out.println(e);
}


                
	}

	@Override
	public void removeFromElement(Student student) {
		try{ 
if(student==null){
throw new IllegalArgumentException(); 
}
else{
int i,g = 0;
for(i=0;i<students.length;i++){
if(students[i]==student){
g=i;
break;
}
}
for(i=g+1;i<students.length;i++){
students[i]=null;
}
}
}
catch(IllegalArgumentException e){
System.out.println(e);
}

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
                int i;
try{ 
if(index<0 || students.length>=index){
throw new IllegalArgumentException(); 
}
else{
for(i=0;i<index;i++){
students[i]=null;
}
int k=0;
int g=students.length-i;
for(i=index;i<g;i++){
students[k]=students[i];

}
}
}
catch(IllegalArgumentException e){
System.out.println(e);
}

	}

	@Override
	public void removeToElement(Student student) {
		try{ 
if(student==null){
throw new IllegalArgumentException(); 
}
else{
int i,index = 0;
for(i=0;i<students.length;i++){
if(students[i]==student){
index=i;
break;
}
}
for(i=0;i<index;i++){
students[i]=null;
}
int l=0;
int g=students.length-i;
for(i=index;i<g;i++){
students[l]=students[i];

}

}
}
catch(IllegalArgumentException e){
System.out.println(e);
}

	}

	@Override
	public void bubbleSort() {
// Add your implementation here
Student[] temp = new Student[getStudents().length];
temp=students;
for(int k=0;k<students.length;k++){
for(int j=i+1;j<students.length;j++){
temp[k] =students[k];
students[k]=students[k+1];
students[k+1]=temp[k];
}
}

} 

@Override
public Student[] getByBirthDate(Date date) {
// Add your implementation here
ArrayList b=new ArrayList();
Student[] tempo = new Student[getStudents().length];
try{
if(date==null){
throw new IllegalArgumentException();
}
else{
for(int i=0;i<b.length;i++){
if(students[i].getBirthDate()==date){
b.add(students[i]);
}
}
tempo = (Student[]) b.toArray();
return tempo;
}
}catch(IllegalArgumentException e){
System.out.println(e);
return tempo;
}

} 


	@Override
public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
    Student[] temp = new Student[getStudents().length];
// Add your implementation here
ArrayList b=new ArrayList();
try{
if(students==null){
throw new IllegalArgumentException();
}
else{
for(int i=0;i<students.length;i++){
if((students[i].getBirthDate().after(firstDate))&&(students[i].getBirthDate().before(lastDate))){
b.add(students[i]);
}
else{
throw new IllegalArgumentException();
}
} 
temp = (Student[]) b.toArray();
}
}
catch(IllegalArgumentException e){
System.out.println(e);
return null;
}

return temp;
} 


	@Override
public Student[] getNearBirthDate(Date date, int days) {
// Add your implementation here
 Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        Date d1=cal.getTime();
		 Date d;
            Student[] s1 = null;
            int r=0;
		if(date==null)
                    throw new IllegalArgumentException();
                else{
                for(int i=0;i<students.length;i++){
                d=students[i].getBirthDate();
                if(d.equals(date) ){
                    s1[r]=students[i];
                    r++;
                }
                else if(d.before(d1) && d.after(d)){
                    s1[r]=students[i];
                    r++;
                }
                }
                }
		return s1;

} 
@Override
public int getCurrentAgeByDate(int indexOfStudent) {
// Add your implementation here
int y=0;
try{
if(indexOfStudent==0){
throw new IllegalArgumentException();
}
else{
Date h=students[indexOfStudent].getBirthDate();
Date g=new Date();
int year = h.getYear(); 
int y1=g.getYear();
y=y1-year;
}
}catch(IllegalArgumentException e){
System.out.println(e);
}
return y;
} 


	@Override
public Student[] getStudentsByAge(int age) {
// Add your implementation here
ArrayList a=new ArrayList();
for(int i=0;i<students.length;i++){
Date h=students[i].getBirthDate();
int y=h.getYear();
if(age+y==2017){
a.add(students[i]);
}
}
Student[] students= (Student[])a.toArray();
return students;

}


	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		ArrayList a=new ArrayList();
int i=0; 
double max=students[0].getAvgMark();
for( i=1;i<students.length;i++){
if(max<students[i].getAvgMark()){
max=students[i].getAvgMark();
}
}
for(i=0;i<students.length;i++){
if(students[i].getAvgMark()==max){
a.add(students[i]);
} 
}
//students=null;
Student[] students= (Student[])a.toArray();
return students;

		
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
                int i=0,index = 0;
try{
if(student==null){
throw new IllegalArgumentException(); 
}

for(i=0;i<students.length;i++){
if(students[i]==student){
index=i;
break;
}
}

}

catch(IllegalArgumentException e){
System.out.println(e);
}
return students[i+1];

		
	}
}
