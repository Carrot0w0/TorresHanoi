package torreshanoi;

public class Hanoi {
    
    public int [] torre1=new int[3];
    public int [] torre2=new int[3];
    public int [] torre3=new int[3];
    
    public boolean Ganar;
   
    public Hanoi(){
    torre1[0]=3;
    torre1[1]=2;
    torre1[2]=1;
    
    torre2[0]=0;
    torre2[1]=0;
    torre2[2]=0;
    
    torre3[0]=0;
    torre3[1]=0;
    torre3[2]=0;
    Ganar=false;
    }    
  
     public boolean Condificha(int ficha){
        boolean sisepuede=false;
        int lugar=0, torre=1;
        for(int i=0;i<3;i++){
        if(torre1[i]==ficha){
            lugar=i;
            torre=1;
        }
        if(torre2[i]==ficha){
            lugar=i;
            torre=2;
        }
        if(torre3[i]==ficha){
            lugar=i;
            torre=3;
        }
    }
        
        for(int i=2;i>lugar;i--){
            if(torre==1){
                if(torre1[i]==0){
                    sisepuede=true;
            }
                else
                    sisepuede=false;
            }
            if(torre==2){
                if(torre2[i]==0){
                    sisepuede=true;
            }
                else
                    sisepuede=false;
            }
            if(torre==3){
                if(torre3[i]==0){
                    sisepuede=true;
            }
                else
                    sisepuede=false;
            
            }
            
        }
        if(lugar==3)
                sisepuede=true;
        return sisepuede;
    }
    
     public boolean Conditorre(int torre,int ficha){
        boolean sisepuede=false;
        if(torre==1){
            for(int i=0;i<3;i++){
                if(torre1[i]>=ficha || torre1[i]==0){
                    sisepuede=true;
                }else
                    i=4;
            }
        }
        if(torre==2){
            for(int i=0;i<3;i++){
                if(torre2[i]>=ficha || torre2[i]==0){
                    sisepuede=true;
                }else
                    i=4;
            }
        }
        if(torre==3){
            for(int i=0;i<3;i++){
                if(torre3[i]>=ficha || torre3[i]==0){
                    sisepuede=true;
                }else
                    i=4;
            }
        }
        return sisepuede;
    }
    
    public boolean Ganar(){
                
        if(torre3[0]==3 && torre3[1]==2 && torre3[2]==1)
               Ganar=true;
        return Ganar;
    }
   
    
    public void Mover(int ficha,int torre){
       int contador=1;
      
       switch (ficha)
       {
           case 1:// ficha
            for(int i=0;i<3;i++){
            if(torre1[i]==ficha){
                torre1[i]=0;
                 }
             }
                for(int i=0;i<3;i++){
            if(torre2[i]==ficha){
                torre2[i]=0;
                 }
             }
            for(int i=0;i<3;i++){
            if(torre3[i]==ficha){
                torre3[i]=0;
                 }
             }
            
               switch (torre)
               {
                   case 1:
               for(int j=0;j<3;j++){
                if(torre1[j]==0){
                    torre1[j]=ficha;
                     j=4;
                      }
                  } 
                   break;
                      case 2:
               for(int j=0;j<3;j++){
                    if(torre2[j]==0){
                    torre2[j]=ficha; 
                    j=4;
                     }  
                  } 
                   break;
                   case 3:
               for(int j=0;j<3;j++){
                     if(torre3[j]==0){
                    torre3[j]=ficha; 
                  j=4;
                     }  
                  } 
                        
                 }
            break;  
           
           
           
           
           
                  case 2://ficah
            for(int i=0;i<3;i++){
            if(torre1[i]==ficha){
                torre1[i]=0;
                 }
             }
            for(int i=0;i<3;i++){
            if(torre2[i]==ficha){
                torre2[i]=0;
                 }
             }
            for(int i=0;i<3;i++){
            if(torre3[i]==ficha){
                torre3[i]=0;
                 }
             }
               switch (torre)
               {
                   case 1:
               for(int j=0;j<3;j++){
                if(torre1[j]==0){
                    torre1[j]=ficha;
                     j=4;
                      }
                  } 
                   break;
                       case 2:
               for(int j=0;j<3;j++){
                     if(torre2[j]==0){
                    torre2[j]=ficha; 
                  j=4;
                     }  
                  } 
                   break;
                   case 3:
               for(int j=0;j<3;j++){
                     if(torre3[j]==0){
                    torre3[j]=ficha; 
                  j=4;
                     }  
                  } 
                     
                 }
                   break;    
           
           
           
           case 3:
            for(int i=0;i<3;i++){
            if(torre1[i]==ficha){
                torre1[i]=0;
                 }
             }
                for(int i=0;i<3;i++){
            if(torre2[i]==ficha){
                torre2[i]=0;
                 }
             }
            for(int i=0;i<3;i++){
            if(torre3[i]==ficha){
                torre3[i]=0;
                 }
             }
               switch (torre)
               {
                   case 1:
               for(int j=0;j<3;j++){
                if(torre1[j]==0){
                    torre1[j]=ficha;
                     j=4;
                      }
                  } 
                   break;
                       case 2:
               for(int j=0;j<3;j++){
                     if(torre2[j]==0){
                    torre2[j]=ficha; 
                  j=4;
                     }  
                  } 
                   break;
                   case 3:
               for(int j=0;j<3;j++){
                     if(torre3[j]==0){
                    torre3[j]=ficha; 
                  j=4;
                     }  
                  } 
                         
                 }
                 
            break; 
           
           
   }
         
  
        
       
        } 
      
       } 
   
          

    
    
 

