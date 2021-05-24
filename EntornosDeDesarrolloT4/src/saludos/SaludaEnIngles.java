package saludos;


class SaludaEnIngles implements Saludo {
            String name = "world";
            public void saluda() {
             saludaAAlguien("world");
            }
            public void saludaAAlguien(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
            
            Saludo frenchGreeting = new FrenchGreeting(this);
        }