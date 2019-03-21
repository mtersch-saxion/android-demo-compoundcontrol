package nl.saxion.mbi12.ap1819.example.compountcontroldemo.customview;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import nl.saxion.mbi12.ap1819.example.compountcontroldemo.R;
import nl.saxion.mbi12.ap1819.example.compountcontroldemo.model.Artist;

public class ArtistView extends ConstraintLayout {
    private Context context;
    private Artist artist;
    private EditText etName, etCountry, etYearOfBirth;

    public ArtistView(Context context) {
        super(context);
        init(context);
    }

    public ArtistView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ArtistView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.artist_component, this);

        OnFocusChangeListener listener = new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateArtist();
            }
        };

        etName = findViewById(R.id.etName);
        etName.setOnFocusChangeListener(listener);
        etCountry = findViewById(R.id.etCountry);
        etCountry.setOnFocusChangeListener(listener);
        etYearOfBirth = findViewById(R.id.etYearOfBirth);
        etYearOfBirth.setOnFocusChangeListener(listener);
    }

    public void setArtist(Artist artist) {
        //this.artist = artist;
        //this.artist = new Artist(artist.getName(), artist.getCountryOfBirth(), artist.getYearOfBirth());
        this.artist = artist.clone();

        etName.setText(this.artist.getName());
        etCountry.setText(this.artist.getCountryOfBirth());
        etYearOfBirth.setText(String.format("%d", this.artist.getYearOfBirth()));
    }

    public Artist getArtist() {
        return artist;
    }

    private void updateArtist() {
        Log.d("ArtistView", "updateArtist() called");

        artist.setName(etName.getText().toString());
        artist.setCountryOfBirth(etCountry.getText().toString());
        artist.setYearOfBirth(Integer.parseInt(etYearOfBirth.getText().toString()));
    }
}
