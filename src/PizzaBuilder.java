import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder
{
    private String m_ChainName;
    private String m_Size;
    private List<PizzaTopping> m_Toppings = new ArrayList<>();

    public PizzaBuilder setChainName(String chainName)
    {
        m_ChainName = chainName;
        return this;
    }

    public PizzaBuilder setSize(String size)
    {
        m_Size = size;
        return this;
    }

    public PizzaBuilder addTopping(PizzaTopping topping)
    {
        m_Toppings.add(topping);
        return this;
    }

    public Pizza build()
    {
        return new Pizza()
        {
            @Override
            public void eat()
            {
                System.out.println(m_ChainName + " - Size: " + m_Size + ", Toppings: " + m_Toppings);
            }
        };
    }
}
