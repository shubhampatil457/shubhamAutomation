package overridingdemo;

 class Cat extends Animal {
        
        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }
        public void sleep() {
        	
        	System.out.println("Cat is sleeping");
        	
        }
    

	}


