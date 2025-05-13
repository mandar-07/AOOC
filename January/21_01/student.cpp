#include <iostream>
using namespace std;

 class Student{
	public:
		static  string name;
		 static int marks;
		 static int roll_no;



		static void show_details(void){
			cout<<"Name of the Student is: "<<name<<endl;
			cout<<"Roll no: "<<roll_no<<endl;
			cout<<"Marks: "<<marks<<endl;
		}

};

string Student::name = "xyz";
int Student::marks = 60;
int Student::roll_no = 3;

int main(void){
	Student::show_details();
	return 0;
}
		
