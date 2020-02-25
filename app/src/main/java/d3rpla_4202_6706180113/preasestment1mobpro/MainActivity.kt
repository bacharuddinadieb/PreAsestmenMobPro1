package d3rpla_4202_6706180113.preasestment1mobpro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationUI.setupActionBarWithNavController(this, this.findNavController(R.id.fragmentUtama))

    }

    override fun onSupportNavigateUp(): Boolean {
        return this.findNavController(R.id.fragmentUtama).navigateUp()
    }
}
