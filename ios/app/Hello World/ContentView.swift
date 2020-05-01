import SwiftUI
import FatModule

struct ContentView: View {
    var body: some View {
        let helloWorld = HelloWorld(message: "Greetings from iOS!")
        let text = "\(helloWorld.message)\n\(helloWorld.egassem())"
        return Text(text)
    }
}
