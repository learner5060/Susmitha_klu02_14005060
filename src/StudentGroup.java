
import java.util.Date;

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
	      if(students==null){
                  //throw exception
              }     
              else{
                 
                  for(int i=0;i<students.length;i++){
                     if(students[i]!=null){
                       this. students[i].setId(students[i].getId());
                        this.students[i].setFullName(students[i].getFullName());
                        this.students[i].setBirthDate(students[i].getBirthDate());
                        this.students[i].setAvgMark(students[i].getAvgMark()); 
                     }   
                  }
              }
              
                    
	}

	@Override
	public Student getStudent(int index) {
                try{
	             if(index<0 || index>students.length){
                        throw new  IllegalArgumentException();              
                     }
                  
                  
                     else{
                         return students[index];
                     }
                  }
                  catch(IllegalArgumentException e){
                      System.out.println(e);
                      return null;
                  }
                  
	}

	@Override
	public void setStudent(Student student, int index) {
            try{
		if(index>0 || index<students.length){
                    if(student!=null){
                        students[index].setId(student.getId());
                        students[index].setFullName(student.getFullName());
                        students[index].setBirthDate(student.getBirthDate());
                        students[index].setAvgMark(student.getAvgMark());
                        
                    }
                    else{
                           throw new  IllegalArgumentException();  
                       
                    }
                }
                else{
                   throw new  IllegalArgumentException(); 
                }
            }
            catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
            
	}

	@Override
	public void addFirst(Student student) {
            try{
		if(student==null){
                   throw new  IllegalArgumentException(); 
                }
                else{
                    
                    int length=students.length+1;
                    Student[] students=new Student[length];
                    while(length-1>=1){
                    students[length-1]=students[length-2];
                    length=length-1;
                    }
                    students[0]=student;
                    
                    
                }
            }
            catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
            
	}

	@Override
	public void addLast(Student student) {
            try{
		if(student==null){
                    throw new  IllegalArgumentException(); 
                }
                else{
                    int length=students.length+1;
                    Student[] students=new Student[length];
                    students[length-1]=student;
                }
            }
            catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
	}

	@Override
	public void add(Student student, int index) {
            try{
		if(student==null){
                   throw new  IllegalArgumentException(); 
                }
                else{
                    if(index<0 || index >=students.length){
                        throw new  IllegalArgumentException(); 
                    }
                    else{
                        int length=students.length+1;
                    Student[] students=new Student[length];
                         while(length-2>=index){
                         students[length-1]=students[length-2];
                         length=length-1;
                         }
                       students[index]=student;
                    }
                }
            }
             catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
            
	}

	@Override
	public void remove(int index) {
            try{
		if(index>0 && index<students.length){
                    while(index>=students.length-2)
                    students[index]=students[index+1];
                    int length=students.length;
                    Student[] students=new Student[length-1];
                }
                else{
                  throw new  IllegalArgumentException(); 
                }
            }
            catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
	}

	@Override
	public void remove(Student student) {
            try{
		if(student==null){
                    throw new  IllegalArgumentException(); 
                }
                else{
                    int flag=0;
                    int index;
                   for(int i=0;i<students.length;i++){
                       if(students[i]==student){
                           flag=1;
                           index=i;
                           
                    while(index>=students.length-2)
                    students[index]=students[index+1];
                    int length=students.length;
                    Student[] students=new Student[length-1];
                           
                       }
                   }
                   if(flag==0){
                       throw new  IllegalArgumentException(); 
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
		if(index>0 && index<students.length){
                    
                    Student[] students=new Student[index+1];
                }
                else{
                    throw new  IllegalArgumentException(); 
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
                    throw new  IllegalArgumentException(); 
                }
                else{
                    int flag=0;
                    int index;
                   for(int i=0;i<students.length;i++){
                       if(students[i]==student){
                           flag=1;
                           index=i;
                          Student[] students=new Student[index+1]; 
                       }
                   }
                   if(flag==0){
                       throw new  IllegalArgumentException(); 
                   }
                }
            }
             catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
	}

	@Override
	public void removeToIndex(int index) {
            try{
		if(index>0 && index<students.length){
                    int k=0;
                    for(int i=index;i<students.length;i++){
                        students[k]=students[i];
                        k=k+1;
                    }
                    int length=students.length-index;
                    Student[] students=new Student[length+1]; 
                    
                }
                else{
                    throw new  IllegalArgumentException(); 
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
                    throw new  IllegalArgumentException(); 
                }
                else{
                    int flag=0;
                    int index;
                   for(int m=0;m<students.length;m++){
                       if(students[m]==student){
                           flag=1;
                           index=m;
                           if(index>0 && index<students.length){
                             int k=0;
                         for(int i=index;i<students.length;i++){
                        students[k]=students[i];
                        k=k+1;
                    }
                    int length=students.length-index;
                    Student[] students=new Student[length+1]; 
                    
                }
                else{
                   throw new  IllegalArgumentException(); 
                }
                           
                           
                        }
                    }
	        }
            } catch(IllegalArgumentException e){
                      System.out.println(e);
                      
                  }
        }

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	      return null;       	
	}

	@Override
	public Student getNextStudent(Student student) {
            try{
		if(student==null){
                    throw new  IllegalArgumentException(); 
                    
                }
                else{
                    int flag=0;
                    for(int i=0;i<students.length;i++){
                        if(students[i]==student){
                            flag=1;
                            return students[i+1];
                            
                            
                        }
                        if(flag==1)
                            break;
                    }
                    if(flag==0){
                       throw new  IllegalArgumentException();  
                    }
                }
            }
             catch(IllegalArgumentException e){
                      System.out.println(e);
                      return null;
                  }
            return null;
	}
}
