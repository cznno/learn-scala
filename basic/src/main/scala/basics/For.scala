import java.io.File
@Async
val filesHere = (new File(".")).listFiles
for (file <- filesHere)
  println(file)
