package com.example.fad_its


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.fad_its.InsideApplication.MenuNavigation.MenuBottomNavigationActivity
import com.example.fad_its.InsideApplication.ScreenApplication.HomepageActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextUserAccount = findViewById<EditText>(R.id.EmailText)
        val TextUserPassword = findViewById<EditText>(R.id.PasswordText)

        val buttonAccess = findViewById<Button>(R.id.ButtonAccess)
      //  val buttonAccessGost = findViewById<Button>(R.id.accessHost)

        buttonAccess.setOnClickListener {
         controllAUTH(TextUserAccount.text.toString(),TextUserPassword.text.toString())
        }

        //inserire il controllo dell'user ospite
       // buttonAccessGost.setOnClickListener {
          // val intent = Intent(this, ::class.java)
          //  startActivity(intent)
       // }

    }




    private fun controllAUTH(TextEmail: String, TextPassword: String){
        val checkOne = ControllEmailCheck(TextEmail.toString())
        if(checkOne == 1)
        {
            val checkTwo = ControllPassword(TextPassword.toString())
            if(checkTwo == 1)
            {
                val checkTree = ControllAccessAccount(TextEmail.toString(),TextPassword.toString())
                if(checkTree == 1)
                {
                    val intent = Intent(this, MenuBottomNavigationActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(applicationContext,"Utente Non REGISTRATO",Toast.LENGTH_SHORT).show()
                }
            }
            else
            {
                Toast.makeText(applicationContext,"Inserisci bene la password",Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(applicationContext,"Inserisci l'email",Toast.LENGTH_SHORT).show()
        }
    }


    //Controll Email User
    private fun ControllEmailCheck( TextEmail:String):Int {
        val TextUserAccount:String  = TextEmail
        if(TextUserAccount.isNotEmpty())
        {
           if(Patterns.EMAIL_ADDRESS.matcher(TextUserAccount).matches())
           {
               return 1
           }
            else
           {
               return 0
           }
        }
        else
        {
            return 0
        }
    }

    //Controll Password User
    private fun ControllPassword(TextPassword:String) : Int {
        val TextPasswordUser:String = TextPassword
        if(TextPasswordUser.isNotEmpty())
        {
            return 1
        }
        else
        {
           return 0
        }
    }

    //Controll Account Log
    private fun ControllAccessAccount(TextEmail: String,TextPassword: String):Int
    {
        val TextPasswordUser:String = TextPassword
        val TextUserAccount:String  = TextEmail

        if(TextUserAccount == "honeymonster@its-pinguinoImperatore.edu.com")
        {
            if (TextPasswordUser == "SerenaGrimaldi25")
            {
                return 1
            }
            else
            {
                return 0
            }
        }
        else
        {
            return 0
        }

    }

}