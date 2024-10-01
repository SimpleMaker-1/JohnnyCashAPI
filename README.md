# JohnnyCashAPI
simple java based JohnnyCashAPI
GetSongByID: https://johnny-cash-api-de4ecab074cf.herokuapp.com/song/{id}/{token}
GetSongByName: https://johnny-cash-api-de4ecab074cf.herokuapp.com/songs/{songName}/{token}
GetSongByAlbum: https://johnny-cash-api-de4ecab074cf.herokuapp.com/songsInAlbum/{albumName}/{token} ^ some names will have issues. I will see if i can fix it but it will require re filling the database and may affect code that relies on the current system.
GetSongByDate: https://johnny-cash-api-de4ecab074cf.herokuapp.com/songsByDate/{date}/{token} ^ Please note that date MUST be in "month,day,year" format, commas NOT slashes, this is crucial
PostSong: https://johnny-cash-api-de4ecab074cf.herokuapp.com/save/{token} ^ plus a json object query
PutSong: https://johnny-cash-api-de4ecab074cf.herokuapp.com/update/{id}/{token} ^ plus a json object query
DeleteSongByID: https://johnny-cash-api-de4ecab074cf.herokuapp.com/song/{id}/{token} ^ dont do this
If you want access to this API, email at: Askme.simplemaker1@gmail.com
there is a known issue with som songs having messed up title strings. this is due partly to the web scraper i built to fill the database. you will have to do data validation if you want to use this properly
