package mymaps.app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng spbu1 = new LatLng(-7.592557, 111.891535);
        mMap.addMarker(new MarkerOptions().position(spbu1).title("SPBU Terminal Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu1));

        LatLng spbu2 = new LatLng(-7.581849, 111.874872);
        mMap.addMarker(new MarkerOptions().position(spbu2).title("SPBU Guyangan, Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu2));

        LatLng spbu3 = new LatLng(-7.564330, 111.841017);
        mMap.addMarker(new MarkerOptions().position(spbu3).title("SPBU Bagor, Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu3));

        LatLng spbu4 = new LatLng(-7.639464, 111.894086);
        mMap.addMarker(new MarkerOptions().position(spbu4).title("SPBU Candi, Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu4));

        LatLng spbu5 = new LatLng(-7.583187, 111.917632);
        mMap.addMarker(new MarkerOptions().position(spbu5).title("SPBU Jl. Bengawan Solo, Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu5));
    }
}
