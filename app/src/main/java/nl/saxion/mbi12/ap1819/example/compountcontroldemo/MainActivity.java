package nl.saxion.mbi12.ap1819.example.compountcontroldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import nl.saxion.mbi12.ap1819.example.compountcontroldemo.customview.ArtistView;
import nl.saxion.mbi12.ap1819.example.compountcontroldemo.model.Artist;

public class MainActivity extends AppCompatActivity {
    private ArtistView avTest, avTest2;
    private Artist artist, artist2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        artist = new Artist("Armin van Buuren", "Nederland", 1979);

        avTest = findViewById(R.id.avTest);
        avTest.setArtist(artist);

        artist2 = new Artist("Nilsson", "Nederland", 1985);
        avTest2 = findViewById(R.id.avTest2);
        avTest2.setArtist(artist2);
    }

    public void getArminsAge(View view) {
        Artist armin = avTest.getArtist();
        Toast.makeText(this, "Armin is nu " + (2019 - armin.getYearOfBirth()), Toast.LENGTH_SHORT).show();
    }
}
