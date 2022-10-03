// repititivo.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;
int main(){
	int n,i=1 ,k=0;
	bool band;

    cout<<"ingrese la cantidad de primos a generar"<<endl;
	cin>>n;
	while (i<=n){
		band=true;
		for (int j=2;j<k;j++)
			if(k % j==0){
				band=false;
				break;
			}
		if (band=true)
		{
		cout<<k <<",";
		i++;
		}
		k++;
	}
	getch();
}

