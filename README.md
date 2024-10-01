# JohnnyCashAPI
simple java based JohnnyCashAPI
Base URL: https://johnny-cash-api-de4ecab074cf.herokuapp.com/
GetSongByID: song/{id}/{token}
GetSongByName: songs/{songName}/{token}
GetSongByAlbum: songsInAlbum/{albumName}/{token}
GetSongByDate: songsByDate/{date}/{token} Please note that date MUST be in "month,day,year" format, commas NOT slashes, this is crucial
PostSong: save/{token} plus a json object query
PutSong: update/{id}/{token} plus a json object query
DeleteSongByID: song/{id}/{token} please dont do this, i would cry. (jk you cant).
If you want access to this API, email at: Askme.simplemaker1@gmail.com
there is a known issue with som songs having messed up title strings. this is due partly to the web scraper i built to fill the database. you will have to do data validation if you want to use this properly
