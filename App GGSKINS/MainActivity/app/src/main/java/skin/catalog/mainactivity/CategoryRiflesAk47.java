package skin.catalog.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryRiflesAk47 extends AppCompatActivity {

    ImageView ak47asiimov;
    private RecyclerView recyclerViewItem;
    private RecyclerViewAdaptador adaptadorItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryriflesak47skins);

        ak47asiimov = (ImageView) findViewById(R.id.ak47asiimov);

        recyclerViewItem=(RecyclerView) findViewById(R.id.recyclerAk47);
        recyclerViewItem.setLayoutManager(new LinearLayoutManager(this));

        adaptadorItem=new RecyclerViewAdaptador(getItem());
        recyclerViewItem.setAdapter(adaptadorItem);

        ak47asiimov.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(CategoryRiflesAk47.this, Ak47Asiimov.class);
                startActivity(i);
            }
        });
    }
    public List<ItemModel> getItem(){
        List<ItemModel> item= new ArrayList<>();
        item.add(new ItemModel("Assimov","Text","Text","Text","Text",R.drawable.ak47asiimov));
        item.add(new ItemModel("Barroque Purple","Text","Text","Text","Text",R.drawable.ak47baroquepurple));
        return  item;
    }
}
