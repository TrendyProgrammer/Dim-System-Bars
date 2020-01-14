override fun onCreate(savedInstanceState : Bundle)
{
        super.onCreate(savedInstanceState)
        
        //Dim System Bars.
        window?.decorView?.apply{
          systemUiVisibility = View.SYSTEM_UI_FLAG_LOW_PROFILE
        }
        // load the layout
        setContentView(R.layout.main_activity)
}
