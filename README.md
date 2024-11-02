# JohnnyCashAPI
Simple java based JohnnyCashAPI

GetSongByID: https://johnny-cash-api-de4ecab074cf.herokuapp.com/song/{id}/{token}

GetSongByName: https://johnny-cash-api-de4ecab074cf.herokuapp.com/songs/{songName}/{token}

GetSongByAlbum: https://johnny-cash-api-de4ecab074cf.herokuapp.com/songsInAlbum/{albumName}/{token} 

^ Some names may have issues due to the data being filled automatically, please use data validation in your code. 

GetSongByDate: https://johnny-cash-api-de4ecab074cf.herokuapp.com/songsByDate/{date}/{token} 

^ Please note that date MUST be in "month,day,year" format, commas NOT slashes, this is crucial. "/" are not usable.

PostSong: https://johnny-cash-api-de4ecab074cf.herokuapp.com/save/{token} 

^ plus a json object query.

PutSong: https://johnny-cash-api-de4ecab074cf.herokuapp.com/update/{id}/{token}

^ plus a json object query.

DeleteSongByID: https://johnny-cash-api-de4ecab074cf.herokuapp.com/song/{id}/{token} 

^ dont do this. (even if you somehow get the master token)

If you want access to this API, email me at: Askme.simplemaker1@gmail.com and tell me what the usecase is.

There are known issues with some songs having messed up title strings. this is due partly to the web scraper i built to fill the database. you will have to do data validation if you want to use this properly. This may be fixed in the future if I choose to swap databases.
