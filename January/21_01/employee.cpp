#include <iostream>
using namespace std;

class Employee{
	private:
		string name;
		int employee_no;
	public:
		Employee(string n, int en): name(n), employee_no(en) {}

		void show_details(void){
			cout<<"Name of the Employee: "<<name<<endl;
			cout<<"Employee no: "<<employee_no<<endl;
		}

};


int main(void){
	Employee emp("Amit", 4254);
	emp.show_details();
	return 0;
}
