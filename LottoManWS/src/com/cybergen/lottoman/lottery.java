package com.cybergen.lottoman;

public class lottery {
    int [] numbers;
    String letter;
    int bonusNumber;
    
    public lottery() {
         
    }
    public lottery(String letter,int[] nums) {
  
        this.letter=letter;
        this.numbers=nums;
    }
    
    public int[] getNumbers(){
        return this.numbers;
    }
    
    public void setNumbers(int[] nums) {
        this.numbers=nums;
        
    }
    
    public void setLetter(String letter) {
        this.letter=letter;
    }
    
    public String getLetter() {
        return this.letter;
    }
    
    public void setBonusNumber(int b) {
        this.bonusNumber=b;
    }
    
    public int getBonusnumber() {
        return this.bonusNumber;
        
    }
    

}
