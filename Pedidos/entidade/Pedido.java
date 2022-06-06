package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	Date momentoDoPedido;
	StatusPedido status;
	
	List<ItemPedido> items = new ArrayList<>();
	
	public void addItem(ItemPedido item) {
		items.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		items.remove(item);
	}
	
	public double total() {
		
		double somaPedido = 0;
		
		for(ItemPedido p : items) {
			somaPedido += p.getPreco();
			
		}
		
		return somaPedido;		
	}

	
	
}
