// In kotlin you can refer to a ui element by its id. To do that you have
// to add a line in the build.gradl file. 
// In the tos of the file you will find the plugins{  }
// In there add the line: id 'kotlin-android-extensions'

// Then you can use the id of en element to refer to that
// For example: 

ackage com.example.permission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonID.setOnClickListener{ // ButtonID is the id from the ui element
	
	}
    }
}
