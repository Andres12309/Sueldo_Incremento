#include <iostream>

using namespace std;

int main(){
	
	float sueldo;
	int categoria;
	float incremento;
	
	cout<<"Ctegorias con sus incrementos"<<endl;
	cout<<"Categoria 1 incremento en 15%"<<endl;
	cout<<"Categoria 2 incremento en 10%"<<endl;
	cout<<"Categoria 3 incremento en 8%"<<endl;
	cout<<"Categoria 4 incremento en 7%"<<endl<<endl;
	cout<<"Ingrese la categoria del incrmento"<<endl;
	cin>>categoria;
	
	switch(categoria){
		case 1:
			incremento=0.15;
			cout<<"Ingrese el sueldo"<<endl;
			cin>>sueldo;
			cout<<endl;
			cout<<"Su nuevo sueldo es:"<<sueldo+(sueldo*incremento)<<endl;
			break;
		case 2:
			incremento=0.10;
			cout<<"Ingrese el sueldo"<<endl;
			cin>>sueldo;
			cout<<endl;
			cout<<"Su nuevo sueldo es:"<<sueldo+(sueldo*incremento)<<endl;
			break;
		case 3:
			incremento=0.08;
			cout<<"Ingrese el sueldo"<<endl;
			cin>>sueldo;
			cout<<endl;
			cout<<"Su nuevo sueldo es:"<<sueldo+(sueldo*incremento)<<endl;
			break;
		case 4:
			incremento=0.07;
			cout<<"Ingrese el sueldo"<<endl;
			cin>>sueldo;
			cout<<endl;
			cout<<"Su nuevo sueldo es:"<<sueldo+(sueldo*incremento)<<endl;
			break;
			
		default:
			cout<<"Categoria incorrecta"<<endl;
	}
	
	
	
	
	return 0;
}
