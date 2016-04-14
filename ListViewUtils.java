
/**
 * Created by luenghw on 2016/4/11.
 * reset the ListView Height when you use ListView in ScrollView
 */
public class ListViewUtils {

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0); // calculate the item height
            totalHeight += listItem.getMeasuredHeight(); //  calculate the item total height
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        // get the item divider height
        // get total height of ListView and reset params
        listView.setLayoutParams(params);
    }
}
