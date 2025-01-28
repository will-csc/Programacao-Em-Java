#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	char cYesNo = '\0';
	int iResp1 = 0;
	int iResp2 = 0;
	int iResp3 = 0;
	int iElaspedTime = 0;
	int iCurrentTime = 0;
	int iRandomNum = 0;
	int i1 = 0;
	int i2 = 0;
	int i3 = 0;
	int iCounter = 0;
	int Difficult = 0;
	int itime = 0;
	int qnt_questions;
	int i4 = rand() % 100;
	int i5 = rand() % 100;
	int iResp4 = 0;
	int iResp5 = 0;

	srand(time(NULL));

	printf("\nPlay a game of Concentration? (y or n): ");
	scanf("%c",&cYesNo);

	if(cYesNo == 'y' || cYesNo == 'Y'){
		do{	printf("\nSelect the difficulty of the game:\n1 - Easy (remember 3 numbers in 5 seconds\n2 - Intermediate (remember 5 numbers in 5 seconds)\n3 - Difficult (remember 5 numbers in 2 seconds)\n4 - Quit\n\n");
			scanf("%d",&Difficult);
			printf("%d",Difficult);
		}while(Difficult < 1 && Difficult > 4);
		
		switch(Difficult){
			case 1:
				itime = 5;
			case 2:
				itime = 5;
			case 3:
				itime = 2;
			case 4:
				break;
		}

		i1 = rand() % 100;
		i2 = rand() % 100;
		i3 = rand() % 100;
		printf("\nConcentrate on the next numbers\n");
		if (Difficult == 1){
			printf("\n%d\t%d\t%d\n",i1,i2,i3);
		}else{
			
			printf("\n%d\t%d\t%d\t%d\t%d\n",i1,i2,i3,i4,i5);
		}

		iCurrentTime = time(NULL);
		do{
			iElaspedTime = time(NULL);
		}while((iElaspedTime - iCurrentTime) < itime); //end of do while loop
		
		system("clear");

		printf("\nEnter each # separeted with one space: ");
		if (Difficult == 1){
			scanf("%d%d%d",&iResp1,&iResp2,&iResp3);
		}else{
			
			scanf("%d%d%d%d%d",&iResp1,&iResp2,&iResp3,&iResp4,&iResp5);
		}
		
		if(Difficult == 1){
			if(i1 == iResp1 && i2 == iResp2 && i3 == iResp3){
				printf("\nCongratularions!\n");
			}else{
				printf("\nSorry, correct numbers were %d %d %d\n",i1,i2,i3);
			}
		}else{
			if(i1 == iResp1 && i2 == iResp2 && i3 == iResp3 && i4 == iResp4 && i5 == iResp5){
				printf("\nCongratularions!\n");
			}else{
				printf("\nSorry, correct numbers were %d %d %d %d %d\n",i1,i2,i3,i4,i5);
			}
		}
	}
}



