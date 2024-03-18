package tradewars.swing;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.table.AbstractTableModel;
import tradewars.U09aWanderingTraderGame;
import tradewars.Product;

/**
 * Handles the stash table list of products
 * @author rob
 */
public class StashTableModel extends AbstractTableModel {

  private String[] columns = {"Name", "Price", "Quantity"};
  private ArrayList<Object[]> data;
  private U09aWanderingTraderGame game;

  public StashTableModel() {
    game = U09aWanderingTraderGame.getInstance();
    reload();
  }

  public int getRowCount() {
    return data.size();
  }

  public int getColumnCount() {
    return columns.length;
  }

  @Override
  public String getColumnName(int c) {
    return columns[c];
  }

  public Object getValueAt(int i, int j) {
    return data.get(i)[j];
  }

  @Override
  public Class getColumnClass(int c) {
    return getValueAt(0, c).getClass();
  }

  public final void reload() {
    data = new ArrayList<Object[]>();

    Product p;
    String price;
    int i = 0;

    Map<Product, Map<Long, Integer>> productList = game.getPlayer().getProducts();
    for (Map.Entry<Product, Map<Long, Integer>> entry : productList.entrySet()) {
      p = entry.getKey();
      for (Map.Entry<Long, Integer> priceSchedule : entry.getValue().entrySet()) {
        price = U09aWanderingTraderGame.CURRENCY_FORMATTER.format(priceSchedule.getKey());
        data.add(new Object[]{p, price, priceSchedule.getValue()});
        i++;
      }
    }

    fireTableDataChanged();
  }
}
