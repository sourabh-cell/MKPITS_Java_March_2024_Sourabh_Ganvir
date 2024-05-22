#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node* next;
};
struct node* head = NULL;

void push(){
	int value;
    printf("\n enter the value\n");
    scanf("%d",&value);
    struct node *newnode= (struct node*)malloc(sizeof(struct node));
    newnode->data=value;
    newnode->next=head;
    head=newnode;
    printf("\n The data is stored\n");
}
void pop(){
	int item;
	struct node *current=head;
	if(head==NULL){
		printf("stack is Empty");
	}
	else{
	item = head->data;  
        current = head;  
        head = head->next;  
        free(current);  
        printf("Item popped");  
	}
}
void show(){
	struct node *current=head;
	if(head==NULL){
		printf("stack is Empty");
	}
	else{
		while(current!=NULL){
			printf("%d",current->data);
			current=current->next;
			printf("\n");
		}
		
}
}

int main(){
int choice;

while(choice!=4)
{
printf("please enter the choice of operation\n 1.Show \n 2.Push \n 3.Pop \n 4.Exit\n");
scanf("%d",&choice);
switch(choice)
{
case 1: show();
      break;
  
case 2: push();
      break;

case 3: pop();
      break;      
      
case 4: exit(0);
       break;   
   
   default: printf("please enter valid choice\n");
            
}
}

}
