public class Driver
{
    public static void main(String[] args)
    {
        PizzaBuilder builder = new PizzaBuilder();

        System.out.println("Pizza Hut: Thr ee pizza one of each size with 3,6 and 9 toppings\n");

        Pizza pizzaHutSmall_1 = builder
                .setChainName(PizzaChain.PIZZA_HUT)
                .setSize(PizzaChain.LARGE)
                .addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.ONIONS)
                .addTopping(PizzaTopping.EXTRA_CHEESE)
                .addTopping(PizzaTopping.HAM_AND_PINEAPPLE)
                .addTopping(PizzaTopping.CHICKEN)
                .addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.SPINACH)
                .addTopping(PizzaTopping.BACON)
                .build();
        pizzaHutSmall_1.eat();

        Pizza pizzaHutMedium_1 = builder
                .setChainName(PizzaChain.PIZZA_HUT)
                .setSize(PizzaChain.LARGE)
                .addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.ONIONS)
                .addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.SPINACH)
                .addTopping(PizzaTopping.BACON)
                .build();
        pizzaHutMedium_1.eat();

        Pizza pizzaHutLarg_1 = builder
                .setChainName(PizzaChain.PIZZA_HUT)
                .setSize(PizzaChain.LARGE)
                .addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.ONIONS)
                .build();
        pizzaHutLarg_1.eat();

        System.out.println("Pizza Hut: Large pizza with 3 toppings\n");

        Pizza pizzaHutLarge_2 = builder
                .setChainName(PizzaChain.PIZZA_HUT)
                .setSize(PizzaChain.LARGE)
                .addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.ONIONS)
                .build();
        pizzaHutLarge_2.eat();

        System.out.println("Pizza Hut: Small pizza with 2 toppings\n");

        Pizza pizzaHutSmall_2 = builder
                .setChainName(PizzaChain.PIZZA_HUT)
                .setSize(PizzaChain.SMALL)
                .addTopping(PizzaTopping.OLIVES)
                .addTopping(PizzaTopping.SPINACH)
                .build();
        pizzaHutSmall_2.eat();

        System.out.println("Little Caesars: Medium pizza with 8 toppings\n");

        Pizza littleCaesarsMedium_2 = builder
                .setChainName(PizzaChain.LITTLE_CAESARS)
                .setSize(PizzaChain.MEDIUM)
                .addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.BACON)
                .addTopping(PizzaTopping.PEPPERS)
                .addTopping(PizzaTopping.ONIONS)
                .addTopping(PizzaTopping.BEEF)
                .addTopping(PizzaTopping.HAM)
                .addTopping(PizzaTopping.EXTRA_CHEESE)
                .build();
        littleCaesarsMedium_2.eat();

        System.out.println("Little Caesars: Medium pizza with 6 toppings\n");

        Pizza littleCaesarsSmall_2 = builder
                .setChainName(PizzaChain.LITTLE_CAESARS)
                .setSize(PizzaChain.MEDIUM)
                .addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.PEPPERS)
                .addTopping(PizzaTopping.ONIONS)
                .addTopping(PizzaTopping.HAM)
                .addTopping(PizzaTopping.EXTRA_CHEESE)
                .build();
        littleCaesarsSmall_2.eat();

        System.out.println("Dominos: Small pizza with 1 topping\n");
        Pizza dominosSmall_2 = builder
                .setChainName(PizzaChain.DOMINOS)
                .setSize(PizzaChain.SMALL)
                .addTopping(PizzaTopping.BACON)
                .build();
        dominosSmall_2.eat();

        System.out.println("Dominos: Large pizza with 3 toppings\n");
        Pizza dominosLarge_2 = builder
                .setChainName(PizzaChain.DOMINOS)
                .setSize(PizzaChain.LARGE)
                .addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.ONIONS)
                .build();
        dominosLarge_2.eat();
    }
}
