package com.example.f55118021_puratempatibadah;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

        // Add a marker in your Home and move the camera
        LatLng home = new LatLng(-0.8428559, 119.9081421);
        LatLng pura = new LatLng(-0.8719308026772666, 119.88263752552116);
        // Add marker to Map
        mMap.addMarker(new MarkerOptions().position(home).title("Marker Rumah")
                .snippet("Ini adalah Rumah Ayu")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.iconhome)));
        mMap.addMarker(new MarkerOptions().position(pura).title("Marker Pura")
                .snippet("Ini adalah Pura Agung Wana Kertha Jagatnatha")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.iconpura)));

        mMap.addPolyline(new PolylineOptions().add(
                home,
                new LatLng(-0.8428797796955465, 119.90795112071774),
                new LatLng(-0.8435639117906054, 119.90793367301002),
                new LatLng(-0.8435603016187092, 119.90552842217622),
                new LatLng(-0.843554162123043, 119.90534597168211),
                new LatLng(-0.8435708264681063, 119.90466090512635),
                new LatLng(-0.8435796713144126, 119.90311868542744),
                new LatLng(-0.8435641788752422, 119.9013451143938),
                new LatLng(-0.8435488660062961, 119.90100575556224),
                new LatLng(-0.8435226681900427, 119.89862029199213),
                new LatLng(-0.8435004929063559, 119.89604250084332),
                new LatLng(-0.8435085540613296, 119.8956634891621),
                new LatLng(-0.8435013539144663, 119.89497259086714),
                new LatLng(-0.843481586220371, 119.89142456712818),
                new LatLng(-0.8434552995960591, 119.89095761603481),
                new LatLng(-0.8461125335080422, 119.89164579225304),
                new LatLng(-0.8468122578793612, 119.89175345390524),
                new LatLng(-0.8475432757082174, 119.8918223072859),
                new LatLng(-0.8486110121038827, 119.89191369450457),
                new LatLng(-0.8489828354848646, 119.89194069692702),
                new LatLng(-0.8502904391742852, 119.89210393877366),
                new LatLng(-0.8508955275006809, 119.89216751903398),
                new LatLng(-0.8515074132901073, 119.89216447112163),
                new LatLng(-0.8522033814674784, 119.89209937337847),
                new LatLng(-0.8528868321103514, 119.89201048990692),
                new LatLng(-0.8532451155943512, 119.89197262716151),
                new LatLng(-0.8535534541172578, 119.89192828169286),
                new LatLng(-0.8544108964507927, 119.89175051477808),
                new LatLng(-0.8571892492750846, 119.89112133333569),
                new LatLng(-0.8576577182658546, 119.89098238439074),
                new LatLng(-0.8579280939717758, 119.89093982048442),
                new LatLng(-0.8589681007759775, 119.89060533448308),
                new LatLng(-0.861669349160129, 119.8900758564496),
                new LatLng(-0.8624956752146758, 119.88991417257411),
                new LatLng(-0.8633854409120622, 119.88968200248092),
                new LatLng(-0.8644756476263584, 119.88933111737285),
                new LatLng(-0.8645795418119545, 119.88924724143722),
                new LatLng(-0.8661446924358539, 119.8886035361132),
                new LatLng(-0.8667031444526012, 119.88841551362063),
                new LatLng(-0.8673904834280344, 119.88818444468443),
                new LatLng(-0.8686491815089488, 119.88778327773656),
                new LatLng(-0.8703803317515199, 119.88722869503361),
                new LatLng(-0.8707128302702764, 119.88718919869793),
                new LatLng(-0.8708905766563233, 119.88728934906894),
                new LatLng(-0.8711659583621391, 119.88712034531744),
                new LatLng(-0.8711659583621391, 119.88695885284814),
                new LatLng(-0.8709406460625597, 119.88676606338869),
                new LatLng(-0.8708667936927762, 119.88657577766529),
                new LatLng(-0.87074281113558, 119.88503400086556),
                new LatLng(-0.8707871984589959, 119.88463788958249),
                new LatLng(-0.8708547921533529, 119.8844451001102),
                new LatLng(-0.8710561067980385, 119.88399606262436),
                new LatLng(-0.871162504271371, 119.88359295738687),
                new LatLng(-0.8710727942555947, 119.88240480817848),
                new LatLng(-0.871863890697275, 119.88256254502146),
                pura
                ).width(10)
                .color(Color.BLUE)
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 11.5f));
    }
}