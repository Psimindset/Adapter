classDiagram
direction BT
class AdvancedMusicPlayer {
  + AdvancedMusicPlayer(String) 
  - String version
  + playMp4(String) void
  + toString() String
   String version
}
class Main {
  + Main() 
  + main(String[]) void
}
class MediaAdapter {
  + MediaAdapter(String) 
  + play(String) void
  + toString() String
   AdvancedMusicPlayer advancedPlayer
}
class Mp3Player {
  + Mp3Player(String) 
  - String Marque
  + toString() String
  + play(String) void
   String Marque
}
class MusicPlayer {
<<Interface>>
  + play(String) void
}

MediaAdapter  ..>  MusicPlayer 
Mp3Player  ..>  MusicPlayer 
