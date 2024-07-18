function example1(){
    document.write("<img src='/Html/MaharajaHotel/image/room1.jpg' alt='nahi bhetali'>");
}

function table(){
   
    document.write("<table border='2'>")
    for(i=1;i<=10;i++)
    {
        document.write("<tr>")
        for(j=1;j<=10;j++)
        {
        document.write("<td>");
        document.write(i*j);
        document.write("</td>");

        }
        document.write("</tr>")
    }

    document.write("</table>")
}


function pattern(){

    for(i=1;i<=10;i++)
        {
            
            for(j=1;j<=i;j++)
            {
            document.write("*")

            }
            document.write("<br>")
        }


}

function pyramid(){
    var row=10

    document.write("<div>");
    for(i=1;i<=row;i++)
        {

            for(j=1;j<row-i;j++){
                document.write("&#160");
            }
            
            for(k=1;k<=(2*i-1);k++)
            {
                document.write("*");
            }
            document.write("<br>");

        }

        document.write("</div>");    
}

function NumberPattern(){
      
    for(i=1;i<10;i++){
        for(j=1;j<=i-1;j++){
         document.write(j);
        }
        document.write("<br>");
    }

}


function square(num){
    var sqr=num*num;
     return sqr;
}

function objectCreation(){
    Sourabh = {
          height:5 ,
          weight:90 , 
          address:"Dighori"
    }

    document.write(Sourabh.height+" "+Sourabh.weight+" "+Sourabh.address);
}